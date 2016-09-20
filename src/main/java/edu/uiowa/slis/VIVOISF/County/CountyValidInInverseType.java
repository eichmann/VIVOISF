package edu.uiowa.slis.VIVOISF.County;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountyValidInInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountyValidInInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountyValidInInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountyValidInInverseIterator theCountyValidInInverseIterator = (CountyValidInInverseIterator)findAncestorWithClass(this, CountyValidInInverseIterator.class);
			pageContext.getOut().print(theCountyValidInInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing County for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for validIn tag ");
		}
		return SKIP_BODY;
	}
}
