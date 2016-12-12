package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNationalityESIterator theArea = (AreaNationalityESIterator)findAncestorWithClass(this, AreaNationalityESIterator.class);
			pageContext.getOut().print(theArea.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

