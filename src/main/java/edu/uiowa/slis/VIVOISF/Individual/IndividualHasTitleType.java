package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasTitleIterator theIndividualHasTitleIterator = (IndividualHasTitleIterator)findAncestorWithClass(this, IndividualHasTitleIterator.class);
			pageContext.getOut().print(theIndividualHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

