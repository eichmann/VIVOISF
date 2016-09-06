package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualTheAbstractIterator theIndividual = (IndividualTheAbstractIterator)findAncestorWithClass(this, IndividualTheAbstractIterator.class);
			pageContext.getOut().print(theIndividual.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

