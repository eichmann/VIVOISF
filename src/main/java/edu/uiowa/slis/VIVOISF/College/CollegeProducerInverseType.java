package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeProducerInverseIterator theCollegeProducerInverseIterator = (CollegeProducerInverseIterator)findAncestorWithClass(this, CollegeProducerInverseIterator.class);
			pageContext.getOut().print(theCollegeProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for producer tag ");
		}
		return SKIP_BODY;
	}
}

