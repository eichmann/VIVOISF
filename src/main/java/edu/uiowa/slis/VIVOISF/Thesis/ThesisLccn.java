package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisLccnIterator theThesis = (ThesisLccnIterator)findAncestorWithClass(this, ThesisLccnIterator.class);
			pageContext.getOut().print(theThesis.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for lccn tag ");
		}
		return SKIP_BODY;
	}
}

