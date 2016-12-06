package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameListENIterator thePosition = (PositionNameListENIterator)findAncestorWithClass(this, PositionNameListENIterator.class);
			pageContext.getOut().print(thePosition.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

