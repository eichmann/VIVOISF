package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountHasGlobalCitationFrequencyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountHasGlobalCitationFrequencyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountHasGlobalCitationFrequencyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountHasGlobalCitationFrequencyInverseIterator theGlobalCitationCountHasGlobalCitationFrequencyInverseIterator = (GlobalCitationCountHasGlobalCitationFrequencyInverseIterator)findAncestorWithClass(this, GlobalCitationCountHasGlobalCitationFrequencyInverseIterator.class);
			pageContext.getOut().print(theGlobalCitationCountHasGlobalCitationFrequencyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for hasGlobalCitationFrequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for hasGlobalCitationFrequency tag ");
		}
		return SKIP_BODY;
	}
}

