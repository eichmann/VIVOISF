package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeDBPediaIDIterator theConferencePoster = (ConferencePosterCodeDBPediaIDIterator)findAncestorWithClass(this, ConferencePosterCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

