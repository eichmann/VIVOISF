package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionHasMemberType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionHasMemberType currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionHasMemberType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Economic_regionHasMemberIterator theEconomic_regionHasMemberIterator = (Economic_regionHasMemberIterator)findAncestorWithClass(this, Economic_regionHasMemberIterator.class);
			pageContext.getOut().print(theEconomic_regionHasMemberIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

