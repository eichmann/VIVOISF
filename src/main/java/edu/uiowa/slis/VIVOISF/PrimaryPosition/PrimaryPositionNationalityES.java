package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNationalityESIterator thePrimaryPosition = (PrimaryPositionNationalityESIterator)findAncestorWithClass(this, PrimaryPositionNationalityESIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

