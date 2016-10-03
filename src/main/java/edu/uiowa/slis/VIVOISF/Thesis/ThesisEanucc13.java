package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisEanucc13Iterator theThesis = (ThesisEanucc13Iterator)findAncestorWithClass(this, ThesisEanucc13Iterator.class);
			pageContext.getOut().print(theThesis.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

