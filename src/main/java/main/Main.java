package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import queries.DependencyGraph;
import queries.QueryGenerationConf;
import ref.Listener;
import ref.schemaLexer;
import ref.schemaParser;
import types.Rule;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static boolean isLatex = true;

    static void showGuiTreeView(final Reader code) throws IOException {
        final org.antlr.v4.runtime.CharStream stream = new ANTLRInputStream(code);
        final schemaLexer lexer = new schemaLexer(stream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final schemaParser parser = new schemaParser(tokens);
        final ParseTree tree = parser.program();
        final List<String> ruleNames = Arrays.asList(schemaParser.ruleNames);
        final TreeViewer view = new TreeViewer(ruleNames, tree);
        view.open();
    }



    static void parseRule(final Reader code) throws IOException {
        final org.antlr.v4.runtime.CharStream input = new ANTLRInputStream(code);
        schemaLexer lexer = new schemaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        schemaParser parser = new schemaParser(tokens);
        schemaParser.ProgramContext tree = parser.program(); // parse a compilationUnit
        Listener classListener = new Listener();
        ParseTreeWalker.DEFAULT.walk(classListener, tree);

        System.out.println("# event/relation: "+classListener.schema.size());
        System.out.println("# MVD: "+classListener.countArrayListMVD());
        System.out.println("# generateRules: "+classListener.countAllRules());

        System.out.println("TAB PRINTING (ltd.)");
        System.out.println("===================");
        //QueryGenerationConf qgc = new QueryGenerationConf();
        //classListener.printQueriesFromTabs(qgc);
        System.out.println("===================\n");

        /*for (Map.Entry<Rule, ArrayList<Rule>> x : classListener.ruleTabClassification.entrySet()) {
            System.out.println(x.getKey());
            for (Rule y : x.getValue()) {
                System.out.println("\t"+y);
            }
        }*/

        /* OLD: System.err.println("INFO: printing the rules in json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("rules.json"), classListener.ruleTabClassification4DB);*/
        Iterable<String> it = () -> classListener.ruleTabClassification4DB.values().stream().flatMap(x -> x.values().stream())
                .map(Rule::toString).iterator();
        Files.write(Paths.get("example.tex"), it);

        /*System.err.println("INFO: detecting cycles");
        DependencyGraph dg = new DependencyGraph(classListener);
        dg.plot();*/
    }

    public static void main(String args[]) throws IOException {
        parseRule(new FileReader("schema_definition.txt"));
    }

}
