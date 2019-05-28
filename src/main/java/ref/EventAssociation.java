package ref;

import algos.Substitute;
import types.Schema;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EventAssociation {
    /**
     * Element that is associated to a begin and end event
     */
    public String schemaName;
    /**
     * Specification of the begin event
     */
    public BeginEndSpecification begin;
    /**
     * Specification of the end event
     */
    public BeginEndSpecification end;

    /**
     * A transfer of ownership: relaxation of the inconsistency contstraint when two element can violate the MVD only for a given amount of time
     */
    public boolean isTransfer;


    public EventAssociation(String schemaName) {
        this.schemaName = schemaName;
        begin = end = null;
    }

    public static class BeginEndSpecification {
        /**
         * If the variable is set to true, once it starts and it ends, it is for ever.
         * Otherwise, if no instance is repeated in the future, then it won't never happen again
         */
        public boolean isUnique;

        /**
         * Event name associated to the begin/end
         */
        public String associatedEventName;

        /**
         * Target on how to rewrite the current element into the given specification
         */
        public Schema schema;

        /**
         * Time arguments associated to the event description
         */
        public ArrayList<String> timeArgs;
        public Map<Integer, String> schemaArgumentWithNoTime() {
            int n = schema.arguments.size();
            return IntStream.range(0, n)
                    .mapToObj(x -> new Substitute.SubPair<>(x, schema.arguments.get(x)))
                    .filter(x -> !timeArgs.contains(x.second))
                    .collect(Collectors.toMap(x -> x.first, x -> x.second));
        }
    }
}
