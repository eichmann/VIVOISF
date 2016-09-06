package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasMember extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasMember currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasMember.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasMemberIterator thegeographical_regionHasMemberIterator = (geographical_regionHasMemberIterator)findAncestorWithClass(this, geographical_regionHasMemberIterator.class);
			pageContext.getOut().print(thegeographical_regionHasMemberIterator.getHasMember());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

