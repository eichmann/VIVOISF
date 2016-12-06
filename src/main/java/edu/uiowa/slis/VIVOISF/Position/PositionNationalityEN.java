package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNationalityENIterator thePosition = (PositionNationalityENIterator)findAncestorWithClass(this, PositionNationalityENIterator.class);
			pageContext.getOut().print(thePosition.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

