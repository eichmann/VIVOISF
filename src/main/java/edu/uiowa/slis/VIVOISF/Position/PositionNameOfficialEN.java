package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameOfficialENIterator thePosition = (PositionNameOfficialENIterator)findAncestorWithClass(this, PositionNameOfficialENIterator.class);
			pageContext.getOut().print(thePosition.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

