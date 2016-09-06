package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisIAO_0000136Iterator theThesisIAO_0000136Iterator = (ThesisIAO_0000136Iterator)findAncestorWithClass(this, ThesisIAO_0000136Iterator.class);
			pageContext.getOut().print(theThesisIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

