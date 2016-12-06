package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNationalityITIterator thePosition = (PositionNationalityITIterator)findAncestorWithClass(this, PositionNationalityITIterator.class);
			pageContext.getOut().print(thePosition.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

