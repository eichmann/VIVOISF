package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNationalityESIterator thePosition = (PositionNationalityESIterator)findAncestorWithClass(this, PositionNationalityESIterator.class);
			pageContext.getOut().print(thePosition.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

