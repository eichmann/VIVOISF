package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteContent currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteContentIterator theStatute = (StatuteContentIterator)findAncestorWithClass(this, StatuteContentIterator.class);
			pageContext.getOut().print(theStatute.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for content tag ");
		}
		return SKIP_BODY;
	}
}

