package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNationalityRUIterator theConferencePoster = (ConferencePosterNationalityRUIterator)findAncestorWithClass(this, ConferencePosterNationalityRUIterator.class);
			pageContext.getOut().print(theConferencePoster.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

