package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNationalityRUIterator thePrimaryPosition = (PrimaryPositionNationalityRUIterator)findAncestorWithClass(this, PrimaryPositionNationalityRUIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

