package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNationalityRUIterator thePosition = (PositionNationalityRUIterator)findAncestorWithClass(this, PositionNationalityRUIterator.class);
			pageContext.getOut().print(thePosition.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

