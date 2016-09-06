package edu.uiowa.slis.VIVOISF.OCRE100038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OCRE100038Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OCRE100038Label currentInstance = null;
	private static final Log log = LogFactory.getLog(OCRE100038Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OCRE100038 theOCRE100038 = (OCRE100038)findAncestorWithClass(this, OCRE100038.class);
			if (!theOCRE100038.commitNeeded) {
				pageContext.getOut().print(theOCRE100038.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OCRE100038 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OCRE100038 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OCRE100038 theOCRE100038 = (OCRE100038)findAncestorWithClass(this, OCRE100038.class);
			return theOCRE100038.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OCRE100038 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OCRE100038 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OCRE100038 theOCRE100038 = (OCRE100038)findAncestorWithClass(this, OCRE100038.class);
			theOCRE100038.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OCRE100038 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OCRE100038 for label tag ");
		}
	}
}

