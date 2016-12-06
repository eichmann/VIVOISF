package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNationalityFRIterator thePrimaryPosition = (PrimaryPositionNationalityFRIterator)findAncestorWithClass(this, PrimaryPositionNationalityFRIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

