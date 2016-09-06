package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualRelatesIterator theIndividualRelatesIterator = (IndividualRelatesIterator)findAncestorWithClass(this, IndividualRelatesIterator.class);
			pageContext.getOut().print(theIndividualRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for relates tag ");
		}
		return SKIP_BODY;
	}
}

