package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Proceedings theProceedings = (Proceedings)findAncestorWithClass(this, Proceedings.class);
			if (!theProceedings.commitNeeded) {
				pageContext.getOut().print(theProceedings.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Proceedings theProceedings = (Proceedings)findAncestorWithClass(this, Proceedings.class);
			return theProceedings.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Proceedings for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Proceedings theProceedings = (Proceedings)findAncestorWithClass(this, Proceedings.class);
			theProceedings.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for label tag ");
		}
	}
}

