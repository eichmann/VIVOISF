package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualFeaturesIterator theIndividualFeaturesIterator = (IndividualFeaturesIterator)findAncestorWithClass(this, IndividualFeaturesIterator.class);
			pageContext.getOut().print(theIndividualFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for features tag ");
		}
		return SKIP_BODY;
	}
}

