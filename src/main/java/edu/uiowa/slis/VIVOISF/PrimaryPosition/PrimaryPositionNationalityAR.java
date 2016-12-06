package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNationalityARIterator thePrimaryPosition = (PrimaryPositionNationalityARIterator)findAncestorWithClass(this, PrimaryPositionNationalityARIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

