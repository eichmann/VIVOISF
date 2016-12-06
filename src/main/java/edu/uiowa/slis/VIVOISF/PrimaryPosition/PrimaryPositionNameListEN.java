package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameListENIterator thePrimaryPosition = (PrimaryPositionNameListENIterator)findAncestorWithClass(this, PrimaryPositionNameListENIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

