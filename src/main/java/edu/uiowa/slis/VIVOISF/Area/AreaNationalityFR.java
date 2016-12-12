package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNationalityFRIterator theArea = (AreaNationalityFRIterator)findAncestorWithClass(this, AreaNationalityFRIterator.class);
			pageContext.getOut().print(theArea.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

