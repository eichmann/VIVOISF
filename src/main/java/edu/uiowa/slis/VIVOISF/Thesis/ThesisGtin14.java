package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisGtin14Iterator theThesis = (ThesisGtin14Iterator)findAncestorWithClass(this, ThesisGtin14Iterator.class);
			pageContext.getOut().print(theThesis.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

