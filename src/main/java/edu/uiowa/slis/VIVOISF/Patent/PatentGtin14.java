package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentGtin14Iterator thePatent = (PatentGtin14Iterator)findAncestorWithClass(this, PatentGtin14Iterator.class);
			pageContext.getOut().print(thePatent.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

