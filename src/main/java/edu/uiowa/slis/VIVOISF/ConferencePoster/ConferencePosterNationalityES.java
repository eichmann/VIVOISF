package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNationalityESIterator theConferencePoster = (ConferencePosterNationalityESIterator)findAncestorWithClass(this, ConferencePosterNationalityESIterator.class);
			pageContext.getOut().print(theConferencePoster.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

