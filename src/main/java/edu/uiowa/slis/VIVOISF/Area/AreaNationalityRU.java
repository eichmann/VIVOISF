package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNationalityRUIterator theArea = (AreaNationalityRUIterator)findAncestorWithClass(this, AreaNationalityRUIterator.class);
			pageContext.getOut().print(theArea.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

