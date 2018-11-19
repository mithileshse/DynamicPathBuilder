package com.mithilesh.pathbuilder;

import org.apache.commons.lang3.builder.ToStringStyle;

public final class NotNullToStringStyle extends ToStringStyle {
    public static final ToStringStyle NOT_NULL_STYLE = new NotNullToStringStyle();

    private static final long serialVersionUID = 1L;

    /**
     * <p>Constructor.</p>
     *
     * <p>Use the static constant rather than instantiating.</p>
     */
    NotNullToStringStyle() {
        super();
        this.setUseClassName(false);
        this.setUseIdentityHashCode(false);
        this.setUseFieldNames(false);
        this.setContentStart("/");
        this.setFieldSeparator("/");
        this.setContentEnd("/");
    }

    /**
     * <p>Ensure <code>Singleton</code> after serialization.</p>
     *
     * @return the singleton
     */
    private Object readResolve() {

        return NOT_NULL_STYLE;
    }

    @Override
    public void append(StringBuffer buffer, String fieldName, Object value, Boolean fullDetail) {
        if (value != null) {

            appendFieldStart(buffer, fieldName);
            appendInternal(buffer, fieldName, value, isFullDetail(fullDetail));
            appendFieldEnd(buffer, fieldName);
        }
    }
}