package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentDateTimeIntervalIterator theContinentDateTimeIntervalIterator = (ContinentDateTimeIntervalIterator)findAncestorWithClass(this, ContinentDateTimeIntervalIterator.class);
			pageContext.getOut().print(theContinentDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

