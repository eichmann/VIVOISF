package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasMemberType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasMemberType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasMemberType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasMemberIterator theeconomic_regionHasMemberIterator = (economic_regionHasMemberIterator)findAncestorWithClass(this, economic_regionHasMemberIterator.class);
			pageContext.getOut().print(theeconomic_regionHasMemberIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

