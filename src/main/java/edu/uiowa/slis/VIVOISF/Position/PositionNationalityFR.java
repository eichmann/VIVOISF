package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNationalityFRIterator thePosition = (PositionNationalityFRIterator)findAncestorWithClass(this, PositionNationalityFRIterator.class);
			pageContext.getOut().print(thePosition.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

