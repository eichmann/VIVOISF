package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeDBPediaIDIterator theIndividual = (IndividualCodeDBPediaIDIterator)findAncestorWithClass(this, IndividualCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theIndividual.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

