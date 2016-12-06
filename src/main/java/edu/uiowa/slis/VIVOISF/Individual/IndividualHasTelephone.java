package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasTelephoneIterator theIndividualHasTelephoneIterator = (IndividualHasTelephoneIterator)findAncestorWithClass(this, IndividualHasTelephoneIterator.class);
			pageContext.getOut().print(theIndividualHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

