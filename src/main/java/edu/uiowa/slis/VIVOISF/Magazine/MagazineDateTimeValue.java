package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineDateTimeValueIterator theMagazineDateTimeValueIterator = (MagazineDateTimeValueIterator)findAncestorWithClass(this, MagazineDateTimeValueIterator.class);
			pageContext.getOut().print(theMagazineDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

