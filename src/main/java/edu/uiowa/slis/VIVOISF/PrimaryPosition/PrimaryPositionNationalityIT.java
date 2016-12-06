package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNationalityITIterator thePrimaryPosition = (PrimaryPositionNationalityITIterator)findAncestorWithClass(this, PrimaryPositionNationalityITIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

