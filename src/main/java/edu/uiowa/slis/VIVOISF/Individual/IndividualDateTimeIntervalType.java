package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualDateTimeIntervalIterator theIndividualDateTimeIntervalIterator = (IndividualDateTimeIntervalIterator)findAncestorWithClass(this, IndividualDateTimeIntervalIterator.class);
			pageContext.getOut().print(theIndividualDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

