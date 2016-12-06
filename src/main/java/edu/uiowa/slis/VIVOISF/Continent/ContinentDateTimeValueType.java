package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentDateTimeValueIterator theContinentDateTimeValueIterator = (ContinentDateTimeValueIterator)findAncestorWithClass(this, ContinentDateTimeValueIterator.class);
			pageContext.getOut().print(theContinentDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

