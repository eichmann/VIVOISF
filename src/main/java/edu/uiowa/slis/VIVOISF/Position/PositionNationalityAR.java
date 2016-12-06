package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNationalityARIterator thePosition = (PositionNationalityARIterator)findAncestorWithClass(this, PositionNationalityARIterator.class);
			pageContext.getOut().print(thePosition.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

