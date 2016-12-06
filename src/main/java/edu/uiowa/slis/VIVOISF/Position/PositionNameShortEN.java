package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameShortENIterator thePosition = (PositionNameShortENIterator)findAncestorWithClass(this, PositionNameShortENIterator.class);
			pageContext.getOut().print(thePosition.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

