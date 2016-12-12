package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNationalityARIterator theArea = (AreaNationalityARIterator)findAncestorWithClass(this, AreaNationalityARIterator.class);
			pageContext.getOut().print(theArea.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

