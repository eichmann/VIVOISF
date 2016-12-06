package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeDBPediaIDIterator theConferencePaper = (ConferencePaperCodeDBPediaIDIterator)findAncestorWithClass(this, ConferencePaperCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

