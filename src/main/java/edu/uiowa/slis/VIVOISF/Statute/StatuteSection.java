package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteSection currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteSectionIterator theStatute = (StatuteSectionIterator)findAncestorWithClass(this, StatuteSectionIterator.class);
			pageContext.getOut().print(theStatute.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for section tag ");
		}
		return SKIP_BODY;
	}
}

