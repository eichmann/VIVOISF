package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNationalityITIterator theArea = (AreaNationalityITIterator)findAncestorWithClass(this, AreaNationalityITIterator.class);
			pageContext.getOut().print(theArea.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

