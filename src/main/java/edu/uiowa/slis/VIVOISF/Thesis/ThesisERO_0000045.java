package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisERO_0000045Iterator theThesis = (ThesisERO_0000045Iterator)findAncestorWithClass(this, ThesisERO_0000045Iterator.class);
			pageContext.getOut().print(theThesis.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

