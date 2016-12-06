package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionIAO_0000115Iterator thegeographical_region = (geographical_regionIAO_0000115Iterator)findAncestorWithClass(this, geographical_regionIAO_0000115Iterator.class);
			pageContext.getOut().print(thegeographical_region.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

