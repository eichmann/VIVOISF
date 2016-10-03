package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationArgued extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationArgued currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationArgued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationArguedIterator theLegislation = (LegislationArguedIterator)findAncestorWithClass(this, LegislationArguedIterator.class);
			pageContext.getOut().print(theLegislation.getArgued());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for argued tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for argued tag ");
		}
		return SKIP_BODY;
	}
}

