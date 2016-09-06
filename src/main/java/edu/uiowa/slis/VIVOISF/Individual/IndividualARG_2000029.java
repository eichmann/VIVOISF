package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualARG_2000029 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualARG_2000029 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualARG_2000029.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualARG_2000029Iterator theIndividualARG_2000029Iterator = (IndividualARG_2000029Iterator)findAncestorWithClass(this, IndividualARG_2000029Iterator.class);
			pageContext.getOut().print(theIndividualARG_2000029Iterator.getARG_2000029());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for ARG_2000029 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for ARG_2000029 tag ");
		}
		return SKIP_BODY;
	}
}

